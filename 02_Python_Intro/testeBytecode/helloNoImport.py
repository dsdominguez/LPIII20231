#Run program using: python scriptName.py op UserName
# op - 1 for hello, 0 for goodbye
#UserName - nome do usu[ario]

import sys

def main():
#    print(sys.argv)
    if len(sys.argv) == 3:
        if sys.argv[1]=='1':
            hello(sys.argv[2])
        elif sys.argv[1]=='0':
            goodbye(sys.argv[2])
    else:
        print('Argumentos insuficientes.')        

def hello(name):
    print(f"Hello, {name} :-) !!!")


def goodbye(name):
    print(f"Goodbye, {name} :-( .")

main()