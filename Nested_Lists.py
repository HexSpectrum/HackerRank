if __name__ == '__main__':
    outer_list = []
    score_set = set()
    
    n = int(input())
    outer_list = ([[input(), float(input())] for _ in range(0,n)])
    score_set = [x[1] for x in outer_list]
    lowest, second_lowest = 102, 101
    score_set.sort()
    
    # can use min()


    for i in range(len(outer_list)):
        if(outer_list[i][1] <= lowest):
            lowest = outer_list[i][1]

    #reduce(lambda x, y: x<y, map(lambda i: outer_list[i][1], range(len(outer_list))))
    print("lowest", lowest)
    for i in score_set:
        if(i > lowest):
            second_lowest = i
            break 
    student_name =[]
    for i in range(len(outer_list)):
        if(second_lowest == outer_list[i][1]):
            student_name.append(outer_list[i][0])
    
    student_name.sort()
    for i in student_name:
        print(i)