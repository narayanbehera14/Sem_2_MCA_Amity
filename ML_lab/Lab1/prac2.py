import csv
fn="salary.csv"
fields = []
rows = []

with open(fn,'r') as csvfile:
    csvreader = csv.reader(csvfile)
    fileds = next(csvreader)
    for row in csvreader:
        rows.append(row)
    print("total no. of rows: %d"% (csvreader.line_num))

print('fiels names are:'+','.join(field for field in fileds))

print("\nFirst names are:\n")

for row in rows[:5]:
        for col in row:

            print("%10s" % col,end=" "),
        print('\n')