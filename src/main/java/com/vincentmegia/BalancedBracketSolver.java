package com.vincentmegia;

public class BalancedBracketSolver {
    public String solve(String s) {
        int n = -1;
        while (s.length() != n) {
            n = s.length();
            s = s.replace("()", "")
                    .replace("[]", "")
                    .replace("{}", "");
        }
        if (s.length() == 0)
            return "YES";
        else
            return "NO";
    }
}
