#!/usr/bin/python

class ListElement:
  def __init__(self, data):
    self.next = None
    self.data = data

def insertInFront(head, data):
  newElement = ListElement(data)
  newElement.next = head
  return newElement

def find(head, data):
  element = head
  while(element and element.data != data):
    element = element.next
  return element

head = ListElement("foo")
head = insertInFront(head, "bar")
head = insertInFront(head, "baz")

print find(head, "baz").data




