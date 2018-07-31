<%--
  Created by IntelliJ IDEA.
  User: Minh Lee
  Date: 7/31/2018
  Time: 8:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>CodeGym Promotion</title>
    <link rel="stylesheet" href="style.css">
  </head>
  <body>
  <div id="content">
    <h2>Product Discount</h2>
    <form>
      <label>Product Description</label><br>
      <input type="text" name="description" placeholder="Describe your wish product"> <br>
      <label>Retail Price</label><br>
      <input type="text" name="price" placeholder="0$"><br>
      <label>Discount Percent</label><br>
      <input type="text" name="percent" placeholder="0">
      <br>
      <button type="submit">Calculate Discount</button>
    </form>
  </div>
  </body>
</html>
