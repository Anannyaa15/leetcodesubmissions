class Solution {
    List<String> res;

    private void generate(String s, int lt, int rt, int n) {
        if(lt == n && rt == n) {
            res.add(new String(s));
            return;
        }

        if(lt < n) {
            generate(s + "(", lt + 1, rt, n);
        } 
        if(rt < n && lt > rt) {
            generate(s + ")", lt, rt + 1, n);
        }
    }

    public List<String> generateParenthesis(int n) {
        res = new ArrayList<>();
        generate("", 0, 0, n);

        return res;
    }
}