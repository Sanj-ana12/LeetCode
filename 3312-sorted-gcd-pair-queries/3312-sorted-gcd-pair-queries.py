from collections import Counter
import bisect

class Solution:
    def gcdValues(self, nums, queries):
        max_val = max(nums)
        
        freq = Counter(nums)
        
        count = [0] * (max_val + 1)
        
        # count how many numbers are divisible by i
        for i in range(1, max_val + 1):
            for j in range(i, max_val + 1, i):
                count[i] += freq[j]
        
        # count pairs with gcd = i
        gcd_count = [0] * (max_val + 1)
        
        for i in range(max_val, 0, -1):
            c = count[i]
            gcd_count[i] = c * (c - 1) // 2
            
            # remove multiples
            for j in range(2 * i, max_val + 1, i):
                gcd_count[i] -= gcd_count[j]
        
        # build prefix sum
        prefix = []
        values = []
        total = 0
        
        for i in range(1, max_val + 1):
            if gcd_count[i] > 0:
                total += gcd_count[i]
                prefix.append(total)
                values.append(i)
        
        # answer queries
        answer = []
        for q in queries:
            idx = bisect.bisect_left(prefix, q + 1)
            answer.append(values[idx])
        
        return answer