ls=[1,13,2,8,4,11,7]

print(max(ls)-min(ls))


m,x,y=0,0,0
for i in ls:
  for j in ls:
    if i-j > m:
      x=i
      y=j
      m = i-j
print(x,"-",y,"=",m)


mx = 0
for i in ls:
  if i > mx:
    mx = i
mi = mx
for i in ls:
  if i < mi:
    mi = i
print(mx,"-",mi,"=",mx-mi)
