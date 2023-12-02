n = int(input())
input_string = input()
k = int(input())
alphabet = "abcdefghijklmnopqrstuvwxyz"
result = ""
for i in input_string:
    if i.isalpha():
        base = ord("A" if i.isupper() else "a")
        # here ord function returns the ascii value of A or a depending on Case
        # it is needed because it sets the starting ascii value of alphabet defending on case
        shifted_char = chr((ord(i)-base+k)%26+base)
        # here chr is used to again convert it back into character from ascii
        # ord(i)-base+k  returns the shifted value 
        # %26 is used to rotate value if it end the alphabet i.e zZ
        # adding the base back to it gives shifted value which is added to result and priented as output 
        result += shifted_char
    else:
        result += i
print(result)