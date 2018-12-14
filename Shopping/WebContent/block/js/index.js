var num = 0;
//全部分类细节显示方法
function dome(w){
	$('.ng-sort-detail').each(function(i,t){
		$(this).css('width','789px');
		if(w==0){
			$(t).html(w0);
		}else if(w==1){
			$(t).html(w1);			
		}else if(w==2){
			$(t).html(w2);			
		}else if(w==3){
			$(t).html(w3);			
		}else if(w==4){
			$(t).html(w4);			
		}else if(w==5){
			$(t).html(w5);			
		}else if(w==6){
			$(t).html(w6);			
		}else if(w==7){
			$(t).html(w7);			
		}else if(w==8){
			$(t).html(w8);			
		}else if(w==9){
			$(t).html(w9);			
		}else if(w==10){
			$(t).html(w10);			
		}else if(w==11){
			$(t).html(w11);			
		}else if(w==12){
			$(t).html(w12);			
		}else if(w==13){
			$(t).html(w13);			
		}
	});
}

$(function(){
	//隐藏与打开顶部广告功能
	$('.J_event_close').click(function(){
		$('.J_event').hide();
	});
	//轮播图
	lbt();
	
	//全部分类动态显示开始
	$('.index-list li').each(function(i,t){
		$(this).mouseover(function(){
			$(this).addClass('current').siblings().removeClass('current');			
//			设置第i个li的内容并显示
			dome(i);
			num = i;
		});
		$(this).mouseout(function(){
//			alert('a')
		});
	});
	
	$('.index-list li').mouseleave(function(){
//		鼠标离开li:隐藏
		$('.ng-sort-detail').css('width','0');
		$(this).removeClass('current');
	});
	$('.ng-sort-detail').mouseenter(function(){
		$('.ng-sort-detail').css('width','789px');
		$('.index-list li').eq(num).addClass('current').siblings().removeClass('current');
	});
	$('.ng-sort-detail').mouseleave(function(){
//		鼠标离开盒子隐藏
//		alert('ng-sort-detail:out')
		$(this).css('width','0');
		$('.index-list li').removeClass('current');
	});
	//全部分类动态显示结束
	$.getJSON("../json/w0.json",function(data){ 
//	         alert(data.text)
	         w0 = data.text0;
	         w1 = data.text1;
	         w2 = data.text2;
	         w3 = data.text3;
	         w4 = data.text4;
	         w5 = data.text5;
	         w6 = data.text6;
	         w7 = data.text7;
	         w8 = data.text8;
	         w9 = data.text9;
	         w10 = data.text10;
	         w11 = data.text11;
	         w12 = data.text12;
	         w13 = data.text13;
	})
	//如果session中有user则显示出来
	
})







