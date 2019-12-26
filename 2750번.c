#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#define max 1000
int main()
{
	int n, k[max] = { 0 };
	int tmp, i, j;
	scanf_s("%d", &n);
	for (i = 0; i < n; i++)
	{
		scanf_s("%d", &k[i]);
	}
	for (i = 0; i < n; i++)
	{
		for (j = 0; j < n - 1; j++)
		{
			if (k[j + 1] < k[j])
			{
				tmp = k[j + 1];
				k[j + 1] = k[j];
				k[j] = tmp;
			}
		}
	}
	for (i = 0; i < n; i++)
	{
		printf("%d\n", k[i]);
	}
}