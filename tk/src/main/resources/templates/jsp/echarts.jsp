<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--交易数据 --%>
<form>
    <div class="row">
        <div class="col-md-12">
            <div class="box box-info">
                <div class="box-body form-horizontal">
                    <div class="form-group">
                        <div class="col-sm-2" style="margin-top: 6px">
                            交易数据
                        </div>
                        <div class="col-sm-1">
                            <a class="btn btn-default" onclick="transactionExportDate()"
                               href="javascript:void(0);">导出数据</a>
                        </div>
                        <div class="col-sm-1">
                            <a class="btn btn-success" onclick="transactionYesterday()"
                               href="javascript:void(0);">昨天</a>
                        </div>
                        <div class="col-sm-1">
                            <a class="btn btn-danger" onclick="transactionSevenDays()"
                               href="javascript:void(0);">最近7天</a>
                        </div>
                        <div class="col-sm-1">
                            <a class="btn btn-info" onclick="transactionThirtyDays()"
                               href="javascript:void(0);">最近30天</a>
                        </div>
                        <div class="col-sm-6">
                            <input class="input-medium search-query" name="createDatetime_start"
                                   type="text" class="form-control" style="width:150px"
                                   id="datetimepicker_start0" data-date-format="yyyy-mm-dd hh:ii:ss" readonly/>~
                            <input class="input-medium search-query" name="createDatetime_end"
                                   type="text" class="form-control" style="width:150px"
                                   id="datetimepicker_end0" data-date-format="yyyy-mm-dd hh:ii:ss" readonly/>
                            <button class="btn btn-info" style="margin-left: 30px"
                                    type="button" id="transactionSearchBtn" onclick="transactionSearch()">查询
                            </button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</form>
<%--交易数据表格 --%>
<div class="row" align="center">
    <div class="col-md-12">
        <div class="box box-info">
            <div class="box-body form-horizontal">
                <div class="form-group" >
                    <table  border="1"  rules="all" style="width: 80%;margin-left: 10px;margin-top: 10px;text-align : center" >
                        <tr>
                            <td>浏览人数</td>
                            <td>下单人数</td>
                            <td>订单数</td>
                            <td>下单金额</td>
                            <td>销售毛利</td>
                        </tr>
                        <tr id="transactionTr1">
                            <td id="t1">{</td>
                            <td id="t2"></td>
                            <td id="t3"></td>
                            <td id="t4">￥</td>
                            <td id="t5">￥</td>
                        </tr>
                        <tr>
                            <td>退款金额</td>
                            <td>付款人数</td>
                            <td>付款订单数</td>
                            <td>付款金额</td>
                            <td>客单价</td>
                        </tr>
                        <tr id="transactionTr2">
                            <td>￥</td>
                            <td></td>
                            <td></td>
                            <td>￥</td>
                            <td>￥</td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>

<%--漏斗图和折线图 --%>
<div class="row" align="center">
    <div class="col-md-12">
        <div class="box box-info">
            <div class="box-body form-horizontal">
                <div class="form-group">
                    <div id="main" style="width: 600px;height:400px;">
                    </div>
                    <div id="transaction">
                        <div>下单转化率：</div>
                        <div>成交转化率：</div>
                        <div>付款转化率：</div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="row" align="center">
    <div class="col-md-12">
        <div class="box box-info">
            <div class="box-body form-horizontal">
                <div class="form-group">
                    <div id="main0" style="width: 600px;height:400px;">
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="row" align="center">
    <div class="col-md-12">
        <div class="box box-info">
            <div class="box-body form-horizontal">
                <div class="form-group">
                    <div id="main1" style="width: 600px;height:400px;">
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<%--订单来源构成 --%>
<form>
    <div class="row">
        <div class="col-md-12">
            <div class="box box-info">
                <div class="box-body form-horizontal">
                    <div class="form-group">
                        <div class="col-sm-2" style="margin-top: 6px">
                            订单来源构成
                        </div>
                        <div class="col-sm-1">
                            <a class="btn btn-default" onclick="transactionSourceExportDate()"
                               href="javascript:void(0);">导出数据</a>
                        </div>
                        <div class="col-sm-1">
                            <a class="btn btn-success" onclick="transactionSourceYesterday()"
                               href="javascript:void(0);">昨天</a>
                        </div>
                        <div class="col-sm-1">
                            <a class="btn btn-danger" onclick="transactionSourceSevenDays()"
                               href="javascript:void(0);">最近7天</a>
                        </div>
                        <div class="col-sm-1">
                            <a class="btn btn-info" onclick="transactionSourceThirtyDays()"
                               href="javascript:void(0);">最近30天</a>
                        </div>
                        <div class="col-sm-6">
                            <input class="input-medium search-query" name="createDatetime_start"
                                   type="text" class="form-control" style="width:150px"
                                   id="datetimepicker_start02" data-date-format="yyyy-mm-dd hh:ii:ss" readonly/>~
                            <input class="input-medium search-query" name="createDatetime_end"
                                   type="text" class="form-control" style="width:150px"
                                   id="datetimepicker_end02" data-date-format="yyyy-mm-dd hh:ii:ss" readonly/>
                            <button class="btn btn-info" style="margin-left: 30px"
                                    type="button" id="authorizeSearchBtn2" onclick="transactionSourceSearch()">查询
                            </button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</form>
<%--来源数据表格 --%>
<div class="row" align="center">
    <div class="col-md-12">
        <div class="box box-info">
            <div class="box-body form-horizontal">
                <div class="form-group" style="align-content:center">
                    <table id="search_source_count_table"  border="1px" rules="all" style="width: 80%;margin-left: 10px;margin-top: 10px;text-align : center" >
                        <tr>
                            <td>订单来源</td>
                            <td>付款金额</td>
                            <td>付款人数/下单人数</td>
                        </tr>
                        <tr>
                            <td>0元砍价</td>
                            <td>￥</td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>全民砍价</td>
                            <td>￥</td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>常规商品</td>
                            <td>￥</td>
                            <td></td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>

<%--饼状图 --%>
<div class="row" align="center">
    <div class="col-md-12">
        <div class="box box-info">
            <div class="box-body form-horizontal">
                <div class="form-group">
                    <div id="main2" style="width: 600px;height:400px;">
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script>



    //漏斗图
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('main'));
    // 指定图表的配置项和数据
    option = {
        title: {
            text: '',
            subtext: ''
        },
        tooltip: {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c}%"
        },
        /*toolbox: {
            feature: {
                dataView: {readOnly: false},
                restore: {},
                saveAsImage: {}
            }
        },*/
        calculable: true,
        series: [
            {
                name:'漏斗图',
                type:'funnel',
                left: '10%',
                top: 60,
                bottom: 60,
                width: '80%',
                min: 0,
                max: 100,
                minSize: '0%',
                maxSize: '100%',
                sort: 'descending',
                gap: 2,
                label: {
                    normal: {
                        show: true,
                        position: 'inside'
                    },
                    emphasis: {
                        textStyle: {
                            fontSize: 20
                        }
                    }
                },
                labelLine: {
                    normal: {
                        length: 10,
                        lineStyle: {
                            width: 1,
                            type: 'solid'
                        }
                    }
                },
                itemStyle: {
                    normal: {
                        borderColor: '#fff',
                        borderWidth: 1
                    }
                },
                data: []
            }
        ]
    };
    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);


    //金额折线图
    // 基于准备好的dom，初始化echarts实例
    var myChart0 = echarts.init(document.getElementById('main0'));
    option0 = {
        title: {
            text: '付款金额'
        },
        tooltip: {
            trigger: 'axis'
        },
        legend: {
            data:['付款金额']
        },
        grid: {
            left: '3%',
            right: '6%',
            bottom: '3%',
            containLabel: true
        },
        /*toolbox: {
            feature: {
                saveAsImage: {}
            }
        },*/
        xAxis: {
            type: 'category',
            boundaryGap: false,
            data: []
        },
        yAxis: [{
            type: 'value',
            name: '金额￥',
            min: 0,
            max: 10000,
            axisLabel: {
                formatter: '{value}'
            }
        }],

        series: [
            {
                yAxisIndex:0,
                name:'付款金额',
                type:'line',
                stack: '总量',
                data:[]
            }
        ]
    };
    myChart0.setOption(option0);

    //折线图2
    // 基于准备好的dom，初始化echarts实例
    var myChart1 = echarts.init(document.getElementById('main1'));
    option1 = {
        title: {
            text: ''
        },
        tooltip: {
            trigger: 'axis'
        },
        legend: {
            data:['付款人数','下单转化率(%)','付款转化率(%)']
        },
        grid: {
            left: '3%',
            right: '4%',
            bottom: '3%',
            containLabel: true
        },
        /*toolbox: {
            feature: {
                saveAsImage: {}
            }
        },*/
        xAxis: {
            type: 'category',
            boundaryGap: false,
            data: []
        },
        yAxis: [{
            type: 'value',
            name: '人数',
            min: 0,
            max: 50,
            axisLabel: {
                formatter: '{value}'
            }
        },{
            type: 'value',
            name: '转化率%',
            min: 0,
            max: 100,
            axisLabel: {
                formatter: '{value}'
            }
        }],

        series: [
            {
                yAxisIndex:0,
                name:'付款人数',
                type:'line',
                stack: '总量',
                data:[]
            },
            {
                yAxisIndex:1,
                name:'下单转化率(%)',
                type:'line',
                stack: '总量',
                data:[]
            },
            {
                yAxisIndex:1,
                name:'付款转化率(%)',
                type:'line',
                stack: '总量',
                data:[]
            }

        ]
    };
    myChart1.setOption(option1);

    //饼状图
    // 基于准备好的dom，初始化echarts实例
    var myChart2 = echarts.init(document.getElementById('main2'));
    option3 = {
        title : {
            text: '',
            subtext: '',
            x:'center'
        },
        tooltip : {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            left: 'left',
            data: ['常规商品','0元砍价','全民砍价']
        },
        series : [
            {
                name: '数据来源',
                type: 'pie',
                radius : '55%',
                center: ['50%', '60%'],
                data:[{value:0,name:"常规商品"},
                    {value:0,name:"0元砍价"},
                    {value:0,name:"全民砍价"}
                ],
                itemStyle: {
                    emphasis: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            }
        ]
    };
    myChart2.setOption(option3);

    $(document).ready(function () {

        $('#datetimepicker_start0').datetimepicker({
            language: 'zh-CN',//选择语言类型
            weekStart: 1,
            todayBtn: 1,
            autoclose: 1,
            todayHighlight: 1,
            minView: 0,
            forceParse: 1,
            showMeridian: 0
        });

        $('#datetimepicker_end0').datetimepicker({
            language: 'zh-CN',//选择语言类型
            weekStart: 1,
            todayBtn: 1,
            autoclose: 1,
            todayHighlight: 1,
            minView: 0,
            forceParse: 1,
            showMeridian: 0
        });
        $('#datetimepicker_start02').datetimepicker({
            language: 'zh-CN',//选择语言类型
            weekStart: 1,
            todayBtn: 1,
            autoclose: 1,
            todayHighlight: 1,
            minView: 0,
            forceParse: 1,
            showMeridian: 0
        });

        $('#datetimepicker_end02').datetimepicker({
            language: 'zh-CN',//选择语言类型
            weekStart: 1,
            todayBtn: 1,
            autoclose: 1,
            todayHighlight: 1,
            minView: 0,
            forceParse: 1,
            showMeridian: 0
        });

    });

    //导出交易数据
    function transactionExportDate(){
        bootbox.alert('<input type="radio" name="day" class="new1" day="1">昨天</input>' +
            '<input type="radio" name="day" class="new1" day=7>最近7天</input>' +
            '<input type="radio" name="day" class="new1" day=30>最近30天</input>' +
            '<input type="radio" name="day" class="new1" day="-1" >导出查询</input>', function () {
            var day = $(".new1:checked").attr("day");
            var begainTime= '';
            var endTime = '';
            if(day == null){
                alert("请选择要导出数据的天数或查询时间！");
                return;
            }
            if(day == "-1"){
                if($("#datetimepicker_start0").val() == '' || $("#datetimepicker_end0").val() == ''){
                    alert("请选择要导出数据的查询时间！");
                    return;
                }
            }
            if (confirm("确定要导出数据吗？")) {
                var url = "${ctx}/mall/transaction/exportTransactionDate";
                if ("-1" == day) {
                    begainTime = $("#datetimepicker_start0").val().toString();
                    endTime = $("#datetimepicker_end0").val().toString();
                    alert(begainTime);
                    //day = createTime + "," + endTime;
                }
                window.location.href=url+"?day="+day+"&begainTime="+begainTime+"&endTime="+endTime;
            }
        })
    };
    //交易数据昨天
    function transactionYesterday(){
        var begainTime = '';
        var endTime = '';
        transactionData(1,begainTime,endTime);
    };
    //交易数据最近7天
    function transactionSevenDays(){
        var begainTime = '';
        var endTime = '';
        transactionData(7,begainTime,endTime);
    };
    //交易数据最近30天
    function transactionThirtyDays(){
        var begainTime = '';
        var endTime = '';
        transactionData(30,begainTime,endTime);
    };
    //交易数据自定义时间查询
    function transactionSearch(){
        var createTime = $("#datetimepicker_start0").val().toString();
        var endTime = $("#datetimepicker_end0").val().toString();
        if ($("#datetimepicker_start0").val() == '' || $("#datetimepicker_end0").val() == '') {
            alert("开始时间或结束时间不能为空！");
            return false;
        } else {
            transactionData(-1,createTime,endTime);
        }
    };

    //数据来源统计-导出数据
    function transactionSourceExportDate(){
        bootbox.alert('<input type="radio" name="day" class="new3" sourceType="2">0元砍价</input>' +
            '<input type="radio" name="day" class="new3" sourceType="3">全民砍价</input>' +
            '<input type="radio" name="day" class="new3" sourceType="1">常规商品</input>',function () {
                var sourceType = $(".new3:checked").attr("sourceType");
                if(sourceType == null ){
                    alert("请选择要导出的数据来源！");
                    return;
                }
                bootbox.alert('<input type="radio" name="day" class="new1" day="1">昨天</input>' +
                    '<input type="radio" name="day" class="new2" day=7>最近7天</input>' +
                    '<input type="radio" name="day" class="new2" day=30>最近30天</input>' +
                    '<input type="radio" name="day" class="new2" day="-1" >导出查询</input>', function () {
                    var day = $(".new2:checked").attr("day");
                    var begainTime= '';
                    var endTime = '';
                    if(day == null){
                        alert("请选择要导出数据的天数或查询时间！");
                        return;
                    }
                    if(day == "-1"){
                        if($("#datetimepicker_start02").val() == '' || $("#datetimepicker_end02").val() == ''){
                            alert("请选择要导出数据的查询时间！");
                            return;
                        }
                    }
                    if (confirm("确定要导出数据吗？")) {
                        var url = "${ctx}/mall/transaction/exportSourceDate";
                        if ("-1" == day) {
                            begainTime = $("#datetimepicker_start02").val().toString();
                            endTime = $("#datetimepicker_end02").val().toString();
                        }
                        window.location.href=url+"?day="+day+"&begainTime="+begainTime+"&endTime="+endTime+"&sourceType="+sourceType;
                    }
                })
            }

        )

    };
    //数据来源统计-昨天
    function transactionSourceYesterday(){
        var begainTime = '';
        var endTime = '';
        sourceData(1,begainTime,endTime);
    };
    //数据来源统计-最近7天
    function transactionSourceSevenDays(){
        var begainTime = '';
        var endTime = '';
        sourceData(7,begainTime,endTime);
    };

    //数据来源统计-最近30天
    function transactionSourceThirtyDays(){
        var begainTime = '';
        var endTime = '';
        sourceData(30,begainTime,endTime);
    };
    //数据来源统计-自定义时间查询
    function transactionSourceSearch(){
        var createTime = $("#datetimepicker_start02").val().toString();
        var endTime = $("#datetimepicker_end02").val().toString();
        if ($("#datetimepicker_start02").val() == '' || $("#datetimepicker_end02").val() == '') {
            alert("开始时间或结束时间不能为空！");
            return false;
        } else {
            sourceData(-1,createTime,endTime);
        }
    };




</script>
<script>
    function transactionData(day,begainTime,endTime){
        //漏斗图
        var option = myChart.getOption();
        var option0 = myChart0.getOption();
        var option1 = myChart1.getOption();

        var data = {
            day:day,
            begainTime:begainTime,
            endTime:endTime
        }
        $.ajax({
            type:'post',
            url:'${ctx}/mall/transaction/getTransactionData',
            data:data,
            dataType:'json',
            success:function(result){
                var htmlStr = "";
                htmlStr+="<td >"+result.totalAuthorizeNum+"</td>";
                htmlStr+="<td>"+result.totalUserOrderNum+"</td>";
                htmlStr+="<td>"+result.orderNum+"</td>";
                htmlStr+="<td>￥"+result.totalOrderAmount+"</td>";
                htmlStr+="<td>￥"+result.orderMargin+"</td>"
                var htmlStr1 = "";
                htmlStr1+="<td>￥"+result.refundAmount+"</td>";
                htmlStr1+="<td>"+result.paymentPeopleNum+"</td>";
                htmlStr1+="<td>"+result.paymentOrderNum+"</td>";
                htmlStr1+="<td>￥"+result.payAmount+"</td>"
                htmlStr1+="<td>￥"+result.perTransactionPrice+"</td>";
                $("#transactionTr1").html(htmlStr);
                $("#transactionTr2").html(htmlStr1);

                var htmlStr2 = '';
                htmlStr2 +="<div>下单转化率："+result.orderConversion+"%</div>" ;
                htmlStr2 +="<div>付款转化率："+result.payConversion+"%</div>";
                htmlStr2 +="<div>成交转化率："+result.dealConversion+"%</div>";
                $("#transaction").html(htmlStr2);
                if(result){
                    //漏斗图
                    option.series[0].data = result.list;
                    myChart.hideLoading();
                    myChart.setOption(option);
                    myChart.hideLoading();

                    //金额折线图1
                    option0.xAxis[0].data = result.echartsResult0.categories;
                    option0.series[0].data = result.echartsResult0.data;
                    myChart0.hideLoading();
                    myChart0.setOption(option0);
                    myChart0.hideLoading();
                    //折线图2
                    //x轴
                    option1.xAxis[0].data = result.echartsResult2.categories;
                    //Y轴
                    option1.series[0].data = result.echartsResult1.data;
                    option1.series[1].data = result.echartsResult2.data;
                    option1.series[2].data = result.echartsResult3.data;
                    myChart1.hideLoading();
                    myChart1.setOption(option1);
                    myChart1.hideLoading();
                };

            },
            error: function () {
                alert("图表请求数据失败!");
                myChart.showLoading();
            }
        });

    }


    function sourceData(day,begainTime,endTime){
        //饼状图
        var option3 = myChart2.getOption();
        $.ajax({
            type:'post',
            data:{"day":day,
                "begainTime":begainTime,
                "endTime":endTime
            },
            url:'${ctx}/mall/transaction/getSourceData',
            dataType:'json',
            success:function(result){

                if(result){
                    option3.series[0].data = result.list1;
                    myChart2.hideLoading();
                    myChart2.setOption(option3);
                    myChart2.hideLoading();
                };
                var htmlStr2 = "";
                htmlStr2+="<tr>";
                htmlStr2+="<td>订单来源</td>";
                htmlStr2+="<td>付款金额</td>";
                htmlStr2+="<td>付款人数/下单人数</td>";
                htmlStr2+="</tr>";
                htmlStr2+="<tr>";
                htmlStr2+="<td>0元砍价</td>";
                htmlStr2+="<td>￥"+result.zeroPayAmount+"</td>";
                htmlStr2+=" <td>"+result.zeroUserOrderNum+"</td>";
                htmlStr2+="</tr>";
                htmlStr2+="<tr>";
                htmlStr2+="<td>全民砍价</td>";
                htmlStr2+="<td>￥"+result.wholePeoplePayAmount+"</td>";
                htmlStr2+="<td>"+result.wholePeopleUserOrderNum+"</td>";
                htmlStr2+="</tr>";
                htmlStr2+=" <tr>";
                htmlStr2+="<td>常规商品</td>";
                htmlStr2+=" <td>￥"+result.normalPayAmount+"</td>";
                htmlStr2+="<td>"+result.normalUserOrderNum+"</td>";
                htmlStr2+="</tr>";
                $("#search_source_count_table").html(htmlStr2);

            },
            error: function () {
                alert("图表请求数据失败!");
                myChart2.showLoading();
            }
        });
    }
    $(function(){
        transactionData(1,'','');
        sourceData(1,'','');
    })
</script>


