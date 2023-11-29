time_input = input()
# strip_time = time_input[:-2]
h = int(time_input[:2])
ms = time_input[2:-2]
if time_input[-2:] == 'PM':
    if h == 12:
        print(f"12{ms}")
    else:
        h += 12
        print(f"{h}{ms}")
        
elif h<10:
    print(f"0{h}{ms}")
    
elif time_input[-2:] == 'AM':
    if h == 12:
        print(f"00{ms}")
    else:
        print(f"{h}{ms}")
