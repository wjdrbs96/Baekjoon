#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#define max 13
int lotto[max];
int combi[max];
int k;

void dfs(int start, int depth)
{
	if (depth == 6)
	{
		for (int i = 0; i < 6; i++)
		{
			printf("%d ", combi[i]);
		}
		printf("\n");
		return;
	}
	for (int i = start; i < k; i++)
	{
		combi[depth] = lotto[i];
		dfs(i + 1, depth + 1);
	}
}
int main()
{
	while (scanf_s("%d", &k) && k)
	{
		for (int i = 0; i < k; i++)
		{
			scanf_s("%d", &lotto[i]);
		}
		dfs(0, 0);
		printf("\n");
	}
	return 0;
}