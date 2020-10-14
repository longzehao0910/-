package com.tedu.esTest;


import org.apache.http.HttpHost;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import java.net.InetAddress;
import java.util.Arrays;
import java.util.Comparator;

public class HelloEs {
    public static void main(String[] args) {
       /* try {


        //设置集群名称bieh101，settrings设置es的集群名称，使用的设计模式，链式设计模式，build设计模式
        Settings settings =Settings.builder().put("cluster.name","bieh101").build();
        //读取es集群中的数据，创建client，
            @SuppressWarnings("resource")
            TransportClient client = new PreBuiltTransportClient(settings).addTransportAddresses(
                //9200端口是restful的请求端口号，java api访问是9300
                //我们使用的是伪集群，所以就配置了一台机器，如果是集群方式，将竞选主节点的加进即可
               new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"),9300));

        //搜索数据（.actionGet()方法是同步的，没有返回就等待）
            //方法是先去索引里面查询出索引数据，再去文档里面查询数据
            GetResponse response = client.prepareGet("news","fulltext","2" ).execute().actionGet();
            //输出结果
            System.out.println("结果为==="+response);

            client.close();
        }catch (Exception e){
            e.printStackTrace();
        }*/

        RestClientBuilder builder = RestClient.builder(HttpHost.create("127.0.0.1"));
    }
}
