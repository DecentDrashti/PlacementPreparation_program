#include <stdio.h>
void main() {
    int num[5] = {2,3,4,5,1};
    int i=0,flag=0;
    int array[6]={0,0,0,0,0,0};
   	for(i = 0; i < 5; i++) {
   		array[num[i]]++;
   		if(array[num[i]]>1){
   			flag++;
   			printf("%d",num[i]);
   			break;
		}
    }
    if(flag==0){
    	printf("No duplicate found");
	}
}
