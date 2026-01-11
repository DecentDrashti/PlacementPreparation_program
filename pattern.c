#include<stdio.h>
void main(){
	int n=5;
	int i=0,j=0;
	for(i=0;i<n;i++){
		for(j=0;j<2*n-1;j++){
			if(j==0||j==2*n-2||j<=i||j>=2*n-2-i){
				printf("*");
			}
			else{
				printf(" ");
			}
		}
		printf("\n");
	}
	for(i=0;i<n-1;i++){
		for(j=0;j<2*n-1;j++){
			if(j==0||j==2*n-2||j<=n-i-2||j>=n+i){
				printf("*");
			}
			else{
				printf(" ");
			}
		}
		printf("\n");
	}
}

output:
*       *
**     **
***   ***
**** ****
*********
**** ****
***   ***
**     **
*       *
