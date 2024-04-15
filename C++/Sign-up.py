def signup():
    users = {}
    username = input("Enter a username: ")
    password = input("Enter a password: ")

    if username in users:
        print("Username already exists. Please choose a different username.")
    else:
       
        users[username] = password
        print("Signup successful!")

signup()