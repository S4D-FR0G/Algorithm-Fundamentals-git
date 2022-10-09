package A;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class demo03_1 {

    public static class s9_1 extends JFrame
    {
        public s9_1()//构造函数，类被创建时调用
        {
            setBounds(300,300,300,300);//设置窗体大小
            setVisible(true);
            setTitle("登录窗口");
            Container c=getContentPane();//获取容器以装载组件
            JLabel id1=new JLabel("用户名");
            JLabel key1=new JLabel("密 码");
            JTextField id2=new JTextField(15);
            JPasswordField key2=new JPasswordField(15);
            key2.setEchoChar('*');//将输入的密码以*显示
            JButton confirm=new JButton("确认");
            JButton cancle=new JButton("取消");
            //将组件添加到容器内
            c.add(id1);
            c.add(key1);
            c.add(id2);
            c.add(key2);
            c.add(confirm);
            c.add(cancle);
            //组件位置
            id1.setBounds(10,40,50,20);
            key1.setBounds(10,80,50,20);
            id2.setBounds(60,40,200,20);
            key2.setBounds(60,80,200,20);
            confirm.setBounds(30,120,60,30);
            cancle.setBounds(190,120,60,30);
            //对各个按钮添加监听事件
            confirm.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(id2.getText().trim().equals("admin")&&new String(key2.getPassword()).equals("123"))//因为类型不兼容问题,要将key2强转为string类型，trim()清除字符串中的空格字符
                    {
                        JOptionPane.showMessageDialog(null,"登录成功");
                        System.exit(0);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"用户名密码错误，请重新输入");
                        id2.setText("");
                        key2.setText("");
                    }
                }
            });
            cancle.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);//退出程序
                }
            });
        }

        public static void main(String args[])
        {
            new s9_1();
        }
    }
}
