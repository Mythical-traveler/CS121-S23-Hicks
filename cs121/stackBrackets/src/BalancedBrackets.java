import java.util.Stack;

public class BalancedBrackets {
    public String cBalance(String string)
    {
        Stack<Character>stack=new Stack<Character>();
        for (int i=0;i<string.length();i++)
        {
            char c = string.charAt(i);
            if (c == '(')
            {
                stack.push(c);
            }
            else if (c==')')
            {
                if (!stack.isEmpty() && stack.peek()=='(')
                {
                    stack.pop();
                } else {
                    return "Unbalanced!";
                }


            }
            else
            {
                stack.pop();
            }
        }
        if (stack.empty())
        {
            return "balanced!";
        }
        else
        {
            return "Unbalanced!";
        }
    }
}
