def minPlatform(arrival, dep):
    i= 0
    j=0
    max_platform=0
    platform=0
    while(i < len(arrival) and j < len(dep)):
        if(arrival[i]<dep[j]):
            platform+=1
            if(platform>max_platform):
                max_platform=platform
            i+=1
        else:
            platform-=1
            j+=1
    return max_platform

a = [9.00, 9.40, 9.50, 11.00, 15.00, 18.00]
D = [9.10, 12.00, 11.20, 11.30, 19.00, 20.00];
print(minPlatform(a,D))
