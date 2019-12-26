#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#define max 100
int sorted[max];
void merge(int list[], int left, int mid, int right)
{
	int i = left, j = mid + 1, k = left, l;
	while (i <= mid && j <= right)
	{
		if (list[i] <= list[j])
			sorted[k++] = list[i++];
		else
			sorted[k++] = list[j++];
	}
	if (i > mid)
	{
		for (l = j; l <= right; l++)
			sorted[k++] = list[l];
	}
	else
	{
		for (l = i; l <= mid; l++)
			sorted[k++] = list[l];
	}
	for (l = left; l <= right; l++)
	{
		list[l] = sorted[l];
	}
}
void merge_sort(int list[], int left, int right)
{
	int mid;
	if (left < right)
	{
		mid = (left + right) / 2;
		merge_sort(list, left, mid);
		merge_sort(list, mid + 1, right);
		merge(list, left, mid, right);
	}
}
int main()
{
	int i, n, list[max];
	scanf_s("%d", &n);
	for (i = 0; i < n; i++)
	{
		scanf_s("%d", &list[i]);
	}
	merge_sort(list, 0, n - 1);

	for (i = 0; i < n; i++)
		printf("%d\n", list[i]);
}