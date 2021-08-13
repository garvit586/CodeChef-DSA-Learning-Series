a,b,c = map(int,input().split())
d=a+b+c
if (a+c>b or a+b>c or b+c>a) and d==180 and a>0 and b>0 and c>0:
    print("YES")
else:
    print("NO")