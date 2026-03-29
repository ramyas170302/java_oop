//classes,objects and constructor

class student{
    int id;
    String name;
    int marks;

    student(int id,String name,int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }

    void show(){
        System.out.println("Name:"+name+"\n"+"ID:"+id+"\n"+"Marks:"+marks+"\n");
    }
}

class objects{
    public static void main(String args[]){
        // create object:
        student s1;// refernce object
        s1=new student(1,"Ramya",20);
        s1.show();
    }
}