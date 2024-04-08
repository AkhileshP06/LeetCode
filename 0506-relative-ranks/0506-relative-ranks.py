class Solution(object):
    def findRelativeRanks(self, score):
        """
        :type score: List[int]
        :rtype: List[str]
        """
        indexed_scores = [(s, i) for i, s in enumerate(score)]
        # Sort the list of tuples in descending order based on scores
        indexed_scores.sort(reverse=True)

        # Initialize a result array with the same length as the input score array
        result = [''] * len(score)

        # Assign ranks based on the original indices
        for i, (s, idx) in enumerate(indexed_scores):
            if i == 0:
                result[idx] = "Gold Medal"
            elif i == 1:
                result[idx] = "Silver Medal"
            elif i == 2:
                result[idx] = "Bronze Medal"
            else:
                result[idx] = str(i + 1)

        return result