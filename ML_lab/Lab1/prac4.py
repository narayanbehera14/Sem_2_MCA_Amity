import matplotlib.pyplot as plt
names = ['A','B','C']
values = [19,40,43]
values_2 = [23,42,22]

fig = plt.figure(figsize=(8.0,6.0))
plt.text(0,30,r'plot text like this',fontsize=15,horizontalalignment='center')
plt.xlabel("Label for x")
plt.ylabel("Label for Y")
plt.bar(names,values)
plt.legend(['Data'],loc='upper right')
plt.suptitle('test plots')
plt.show()

#fruits yeilds

years=range(2000,2006)
apples=[100,123,33,44,66,77]
oranges=[102,130,111,120,109,122]
plt.xlabel('years')
plt.ylabel('yield in tons')
plt.title('crop yeild in maharashtra ')
plt.bar(years,apples)

plt.bar(years,oranges,bottom=apples)
plt.show()