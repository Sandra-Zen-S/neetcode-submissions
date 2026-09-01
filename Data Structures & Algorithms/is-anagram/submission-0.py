class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        string1 = sorted(s)
        string2 = sorted(t)
        if len(s) != len(t):
            return False
        if string1 == string2:
            return True
        return False