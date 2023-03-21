package com.yang.javadesignpatterns.Asingletons;

/**
 * @ClassName Mgr01
 * @Author yang
 * @Description 2 和饿汉式 本质没有区别。
 *  类加载到内存后，就实例化为一个单例  JVM来保证线程安全
 *  简单实用，推荐实用
 *
 *  唯一缺点 不管使用与否，类装载时，就已经完成实例化
 *
 *  装载：class.forName("xxxx")
 *  （话说如果不用，就不需要装载它）
 * @Date 23/03/20 1:02
 * @Version v1.0
 **/


public class Mgr02 {
    private static final Mgr02 INSTANCE;

    // 加了 静态方法
    static {
        INSTANCE = new Mgr02();
    }

    // 构造方法私有化---其他类里面就不能使用 new 了
    private Mgr02(){}

    // 返回唯一实例
    public static Mgr02 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        // 创建2个对象，来比较同一个类不同对象的 hash值
        Mgr02 m1 = Mgr02.getInstance();
        Mgr02 m2 = Mgr02.getInstance();

        System.out.println(m1 == m2);
        System.out.println(m1.hashCode() );
        System.out.println(m1.hashCode() );
    }


}
