### Recurrence:

```
minFallPath(row,col){
	if (row>=N) return 0;
	res=inf;

	for (j=0;j<N;j++){
		if (abs(col-j)<2){
			res=min(res,A[row][col]+minFallPath(row+1,j))
		}
	}
	return res;

}
```

Pick max for the col in first row minFallPath(0,col), where col=0,N-1

### Subproblem:

I think I need a grid to store the solution like dp[row,col]. Dp[row][col] stores min value for the path starting at row `row` and column `col`
