源：
http://www.ljlsky.com/

705182 Youxi741
【视频：The BIG Talk硅谷峰会：深度学习和在线教育】
http://www.iqiyi.com/v_19rro2tzdo.html?src=sharemodclk131212

配置的tomcat 8.0

日志 2015-02-27  VLOOKUP
excel表格 A表格 两列 拿到B表格 进行检索 获得相应行数  取B表格对应 行数的某一列 放到A表格固定位置
vlookup 函数  将A表格两列进行合并 B表格同理  拿A表格的某列到B表格检索后 获取值后进行填入。
=VLOOKUP(W25,[001到货单列表.XLS]价格综合!$J:$K,2,FALSE())

日志 2015-02-27  mysql存储图片
新建数据库 - 表 存储图片路径

日志 2015-03-22  前后端传值
struts2 的OGNL表达式可以：public PeopleAction extends ActionSuper{
private List<People> peopleList; //定义需要传递到页面的list对象 需要提供get set 方法
get...
set...

public String getList(){
peopleList = peopleServer.getList(); //将获取的数据赋值给list
}
然后再需要显示的页面使用jstl或者struts自己的标签循环显示
<c:forEach item="${peopleList}" var="item">
....
</c:forEach>
   
}

2015-05-26
<s:property value='listTime' />会把整个List中的值一起挨个显示出来。
遍历显示的话还是用，抄一下上面的。
集合元素需要迭代。
<s:iterator value="listTime">
  <p>time is: <s:property/></p>
</s:iterator>

对于集合里边的属性又可以这样：比如Lista<A> aList = 具体包含数据的ArrayList；A类中有属性aid,aname,
<s:iterator value="#aList " id="a">
	<tr>
		<td><s:property value="#a.aid" /></td>					                <td><s:property value="#a.aname" /></td>
                </tr>
 </s:iterator>
 
 2015-7-27 红包算法( 转)
 红包生成算法的需求
预先生成所有的红包还是一个请求随机生成一个红包
简单来说，就是把一个大整数m分解（直接以“分为单位，如1元即100）分解成n个小整数的过程，小整数的范围是[min, max]。

最简单的思路，先保底，每个小红包保证有min，然后每个请求都随机生成一个0到(max-min)范围的整数，再加上min就是红包的钱数。

这个算法虽然简单，但是有一个弊端：最后生成的红包可能都是min钱数的。也就是说可能最后的红包都是0.01元的。

 

另一种方式是预先生成所有红包，这样就比较容易控制了。我选择的是预先生成所有的红包。

回到顶部
理想的红包生成算法
理想的红包生成结果是平均值附近的红包比较多，大红包和小红包的数量比较少。

可以想像下，生成红包的数量的分布有点像正态分布。

 

那么如何实现这种平均线附近值比较多的要求呢？

就是要找到一种算法，可以提高平均值附近的概率。那么利用一种”膨胀“再”收缩“的方式来达到这种效果。

先平方，再生成平方范围内的随机数，再开方，那么概率就不再是平均的了。
 