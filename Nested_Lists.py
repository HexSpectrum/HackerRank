if __name__ == '__main__':
    outer_list = []
    score_set = set()
    for _ in range(int(input())):
        name = input()
        score = float(input())
        student_list = [name,score]
        outer_list.append(student_list)
        score_set.add(score)
    
    lowest, second_lowest = 102, 101
    score_list = list(score_set)
    score_list.sort()
    
    for i in range(len(outer_list)):
        if(outer_list[i][1] <= lowest):
            lowest = outer_list[i][1]
    for i in score_list:
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