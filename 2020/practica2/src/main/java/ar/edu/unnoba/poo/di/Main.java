package ar.edu.unnoba.poo.di;

public class Main {
	public static void main(String[] args) {
        //Injections
		ApplicationContext context =
            new ClassPathXmlApplicationContext("beans.xml");
        GreetMeBean bean = (GreetMeBean) context.getBean("greetMeBean");
        bean.execute();
        
        //Tradicional
        EnglishGreeter greeter = new EnglishGreeter();
        GreetMeBean me = new GreetMeBean();
        me.setGreeter(greeter);
    }
}