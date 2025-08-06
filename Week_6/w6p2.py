entries = list(input("Enter comma separated pairs like name:phone: ").split(','))
print(entries)
book = {}
for entry in entries:
  name, phone = entry.split(':')
  book[name] = phone

username = input("Enter a username to find: ")
try:
  print(f"{username}'s Phone Number:", book[username])
except:
  print(f"No user with name '{username}' exist in phone book.")