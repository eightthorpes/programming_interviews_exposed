#!/usr/bin/python

class ListElement:
  def __init__(self, data):
    self.next = None
    self.data = data

def insertInFront(head, data):
  newElement = ListElement(data)
  newElement.next = head
  return newElement

def deleteElement(head, data):
  element = head
  previous = head
  while(element):
    if (element.data == data):
      head = previous
      head.next = element.next
      break
    previous = element
    element = element.next

def find(head, data):
  element = head
  while(element and element.data != data):
    element = element.next
  return element

head = ListElement("foo")
head = insertInFront(head, "bar")
head = insertInFront(head, "baz")

print find(head, "baz").data
print find(head, "bing")

deleteElement(head, "baz")




