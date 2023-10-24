import random
creamer = input("Do you like ice cream?")
def IcecreamFlavor():
    flavor = ["mint", "chocolate", "vanilla", "strawberry"]
    chooseFlavor = random.choice(flavor)
    return f"Here you have {chooseFlavor} ice cream!"
print (IcecreamFlavor())