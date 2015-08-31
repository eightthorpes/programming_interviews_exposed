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

class Stack:
  def __init__(self):
    self.head = None

  def push(self, data):
    element = ListElement(data);
    element.next = self.head
    self.head = element

  def pop(self):
    element = self.head
    if (self.head):
      self.head = self.head.next
    return element

s = Stack()
s.push("foo")
s.push("bar")
s.push("baz")
print s.pop().data
print s.pop().data
print s.pop().data
print s.pop()




