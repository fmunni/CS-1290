### Recurrence:

```
minimumNumberOfPerfectSquare(N){
	if (N==0) return 0;
	res=N;
	for (i=1;i*i<=N;i++)
		res=min(res,1+minimumNumberOfPerfectSquare(N-i*i)) ;
	return res;
}
```

### Subproblem:

I will keep an array dp of size N+1, where dp[i] store the minimumNumberOfPerfectSquare for i.
Dp[0]=0;
Dp[i]= would be calculated using minimum of dp[i-1],dp[i-4],dp[i-9]….so on.
