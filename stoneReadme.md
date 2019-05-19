I will have a function sum(i,j) that returns sum of the stones in range i,j inclusive.

### Recurrence:

```
maxStones(i,j){
if (i>j) return 0;
return max(sum(i,j)- maxStones (i+1,j),
sum(i,j)- maxStones (i,j-1));
}
```

Finally return maxStones(0,n-1)>sum(0,n-1)/2

### Subproblem:

dp[i][j] would stores maximum stones a player can have the player using piles in range i..j inclusive
