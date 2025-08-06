import os

def startEntry():
  print("Enter space separated entries - Roll, Name, Marks:")
  done = True
  while done:
    entry = input()
    if entry.lower() == 'done':
      done = False
    else:
      entry = tuple(entry.split())
      entry_str = '\t'.join(entry)
      file.write(entry_str + '\n')

if os.path.exists('Marks.data'):
  with open('Marks.data', 'a') as file:
    startEntry()
else:
  with open('Marks.data', 'w') as file:
    startEntry()