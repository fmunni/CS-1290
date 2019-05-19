### Recurrence:

```
minDelete(s1,s2){
	if (s1.length()==0) return sumOfASCII(s2)
	if (s2.length()==0) return sumOfASCII(s1)

	if (s1.charAt(0)==s2.charAt(0))
return minDelete(s1.substring(1),s2.substring(1));
	else{
		int c1= s1.charAt(0);
		int c2= s2.charAt(0);
	return min(c1+minDelete(s1.substring(1),s2), c2+minDelete(s1,s2. substring(1))
}
}
```

### Subproblem:

I will use dp[i][j], which is the min sum of ascii for string s1[0…i] and string s2[0…j] to be equal.
