package cn.tunyl.stuctural.jakproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private TrainStation station = new TrainStation();

    public SellTickets getProxyObject() {
        // 使用Proxy获取代理对象
        /**
         * newProxyIntance()参数说明：
         * Classloader loader: 类加载器，用于加载代理类，使用真实对象的类加载器即可
         * Class<?> interfaces: 真实对象所实现的接口，代理模式，真实对象和代理对象实现相同接口
         * InvocationHandler h: 代理对象的调用处理器
         *
         */
        SellTickets sellTickets = (SellTickets) Proxy.newProxyInstance(station.getClass().getClassLoader(), station.getClass().getInterfaces(), new InvocationHandler() {
            /**
             *
             * @param proxy 代理对象
             *
             * @param method 对应于代理对象上调用的接口方法的Method实例
             *
             * @param args 代理对象调用接口方法时传递的实际参数
             *
             * @return
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("代理点收取一些服务费（JDK动态代理方式");
                Object result = method.invoke(station, args);
                return result;
            }
        });


        return sellTickets;
    }
}
