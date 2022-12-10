package cn.tunyl.stuctural.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxFactory implements MethodInterceptor {
    private TrainStation target  = new TrainStation();

    public TrainStation getProxyObject(){
        // 创建Enhancer对象，类似于JDK动态代理的Proxy类，下一步就设置几个参数
        Enhancer enhancer = new Enhancer();
        // 设置父类字节码对象
        enhancer.setSuperclass(target.getClass());
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建代理对象
        TrainStation obj = (TrainStation) enhancer.create();
        return obj;

    }

    /**
     *
     * @param o 代理对象
     * @param method 真实对象中的方法的Method实例
     * @param objects 实际参数
     * @param methodProxy: 代理对象中的方法方法的method实例
     * @return
     * @throws Throwable
     */

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理点收取一些服务费用（CGLIB动态代理方式)");
        TrainStation result = (TrainStation) methodProxy.invokeSuper(o, objects);
        return result;
    }
}
