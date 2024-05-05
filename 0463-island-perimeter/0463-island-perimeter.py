class Solution(object):
    def islandPerimeter(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        rows = len(grid)
        cols = len(grid[0])
        perimeter = 0

        for r in range(rows):
            for c in range(cols):
                if grid[r][c] == 1:
                    # Assume each land cell contributes 4 edges
                    perimeter += 4

                    # Check for shared edges with the neighboring cells
                    if r > 0 and grid[r - 1][c] == 1:  # Shared edge with the cell above
                        perimeter -= 2
                    if c > 0 and grid[r][c - 1] == 1:  # Shared edge with the cell to the left
                        perimeter -= 2

        return perimeter