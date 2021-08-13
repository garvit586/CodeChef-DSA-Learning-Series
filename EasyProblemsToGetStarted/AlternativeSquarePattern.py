N = int(input())
m,c = [],[]
l = [i for i in range(1,5*N+1)]
for i in range(N):
    m.append(l[i*5:(i+1)*5])
for i in range(N):
    if i%2 != 0:
        m[i]=m[i][::-1]
for i in m:
    for j in i:
        print(j,end=" ")
    print()