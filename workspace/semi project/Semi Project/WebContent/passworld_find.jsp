<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>우리동네 헬스장</title>
<style type="text/css">
	.mzina{
		text-align:center;
	}

	.button1{
		background-color : gray;
		color : white;
	}
	.button2{
		background-color : #00AAFF;
		color : white;
		
	}
</style>

</head>
<body>
	<div>
		<header class="">
			<h4>아이디*비밀번호 찾기</h4>
		</header>
		가입시 입력하셨던 이메일 주소를 작성해주세요. <p>
		입력하신 이메일 주소로 인증번호를 발송해 드립니다.
			<p>
		<form>
			<div class="USER_ID">ID</div><p>
			<input name ="username" type="text" placeholder="아이디를 입력하세요">
			<p><p>
			<label for="USER_BIRTH DATE">생년월일</label>
			<p>
			<select name="year">
					<option value="00">년도</option>
					<option value="01">1990</option>
					<option value="02">1991</option>
					<option value="03">1992</option>
					<option value="04">1993</option>
					<option value="05">1994</option>
					<option value="06">1995</option>
					<option value="07">1996</option>
					<option value="08">1997</option>
					<option value="09">1998</option>
					<option value="10">1999</option>
					<option value="11">2000</option>
					<option value="12">2001</option>
					<option value="13">2002</option>
					<option value="14">2003</option>
					<option value="15">2004</option>
					<option value="16">2005</option>
					<option value="17">2006</option>
					<option value="18">2007</option>
					<option value="19">2008</option>
					<option value="20">2009</option>
					<option value="21">2010</option>
					<option value="22">2011</option>
					<option value="23">2012</option>
					<option value="24">2013</option>
					<option value="25">2014</option>
					<option value="26">2015</option>
					<option value="27">2016</option>
					<option value="28">2017</option>
					<option value="29">2018</option>
					<option value="30">2019</option>
					<option value="31">2020</option>
					<option value="32">2021</option>
			</select> 
			<select name="birthmm">
					<option value="00">월</option>
					<option value="01">1</option>
					<option value="02">2</option>
					<option value="03">3</option>
					<option value="04">4</option>
					<option value="05">5</option>
					<option value="06">6</option>
					<option value="07">7</option>
					<option value="08">8</option>
					<option value="09">9</option>
					<option value="10">10</option>
					<option value="11">11</option>
					<option value="12">12</option>
			</select> 
			<select name="day">
					<option value="00">일</option>
					<option value="01">1</option>
					<option value="02">2</option>
					<option value="03">3</option>
					<option value="04">4</option>
					<option value="05">5</option>
					<option value="06">6</option>
					<option value="07">7</option>
					<option value="08">8</option>
					<option value="09">9</option>
					<option value="10">10</option>
					<option value="11">11</option>
					<option value="12">12</option>
					<option value="13">13</option>
					<option value="14">14</option>
					<option value="15">15</option>
					<option value="16">16</option>
					<option value="17">17</option>
					<option value="18">18</option>
					<option value="19">19</option>
					<option value="20">20</option>
					<option value="21">21</option>
					<option value="22">22</option>
					<option value="23">23</option>
					<option value="24">24</option>
					<option value="25">25</option>
					<option value="26">26</option>
					<option value="27">27</option>
					<option value="28">28</option>
					<option value="29">29</option>
					<option value="30">30</option>
					<option value="31">31</option>
			</select>
			<p><p>
			<div id="USER_PHONE">휴대전화번호</div>
			<p>
			<select name="contury">
					<option value="00">대한민국 +82</option>
					<option value="01">1</option>
					<option value="02">2</option>
					<option value="03">3</option>
					<option value="04">4</option>
			</select> 
			<p>
			<input type="text" name="id" maxlength="50" placeholder="전화번호 입력">
			<p>
			<input type="text" name="id" maxlength="50" placeholder="인증번호 6자리">
		    <input type="button" value="인증번호 받기" class="button1">

		   	<p><p>
		   	<div id="USER_EMAIL">E-mail</div>
		   	<p>
			<input type="email" maxlength="30" placeholder="이메일 주소 입력">
			<p><p>
			<input type="button" value="확인" class="button2">
			</div>			
		</form>
			


		
	</div>
		<footer>
		 <p>Copyright © . All rights reserved.</p>

		</footer>
	
</body>
</html>