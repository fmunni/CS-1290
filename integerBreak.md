### Recurrence:

```
maxProduct(N){
	if (N==0) return 1;
res=0;
for (i=1;i<=N;i++)
	res=max(res,i*maxProduct(N-i))
	return res;
}
```

##### To make at least two:

Return max among all i\*maxProduct(N-i), where i=1..N-1

### Subproblem:

    I will store in a 1D array dp. Dp[i] stores maxProduct for I, then I will pick max i*dp[N-i] for all i in range 1,N-1
