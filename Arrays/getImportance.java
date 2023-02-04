class Solution {

    
    public int getImportance(List<Employee> employees, int id) {
        Queue<Integer> q = new LinkedList<>();
        int importance =0;
        q.add(id);

        while(!q.isEmpty())
        {
            int x = q.poll();
            Employee e = null;
            for(int i=0;i<employees.size();i++)
            {
                if(employees.get(i).id==x)
                {
                    e=(Employee)employees.get(i);
                    break;
                }
            }
            importance+=e.importance;
            for(int i=0;i<e.subordinates.size();i++)
            {
                q.add((int)e.subordinates.get(i));
            }
        }
        return importance;
        
    }
}