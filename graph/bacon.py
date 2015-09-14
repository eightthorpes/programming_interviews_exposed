#!/usr/bin/python

class Actor:
  def __init__(self, name):
    self.name = name
    self.links = []

  def addLink(self, link):
    self.links.append(link)

def findShortest(base, target_name, max_level):
  level = 1
  actors = [base]
  while level < max_level:
    level_actors = actors
    actors = []
    for actor in level_actors:
      actors = actors + actor.links
    for actor in actors:
      if actor.name == target_name:
        return level
    level += 1

a = Actor('aaron')
b = Actor('bob')
c = Actor('charlie')
d = Actor('doug')
e = Actor('ed')
f = Actor('fred')

a.addLink(b)
a.addLink(c)
b.addLink(d)
b.addLink(e)
e.addLink(f)

level = findShortest(a, 'fred', 10)
print level
level = findShortest(a, 'fed', 10)
