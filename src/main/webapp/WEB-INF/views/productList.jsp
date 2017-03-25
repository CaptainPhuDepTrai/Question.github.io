<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/template/header.jsp"%>





<!-- Marketing messaging and featurettes
================================================== -->
<!-- Wrap the rest of the page in another container to center all the content. -->

<div class="container-wrapper" style="margin-top:5em">
    <div class="container">
        <div class="page-header">
           <h1>All Products</h1>
            <p class="lead">Checkout all the awesome products available now</p>
        </div>
        <table class="table table-striped table-hover">
            <thead>
            <tr class="bg-success">
                <th>Image Thumb</th>
                <th>Product Name</th>
                <th>Category</th>
                <th>Condition</th>
                <th>Price</th>
                <th></th>
            </tr>

            </thead>
            <c:forEach var="product" items ="${productList}">
            <tr>
                <td><img src="<c:url value="/resources/images/${product.productId}.png"/>" alt="image"  style="width: 100%"></td>
                <td>${product.productName}</td>
                <td>${product.productCategory}</td>
                <td>${product.productStatus}</td>
                <td>${product.productPrice}</td>
                <td>
                    <a href="<spring:url value="/viewProduct/${product.productId}"/>">
                        <span class="glyphicon glyphicon-info-sign"></span>
                    </a>

                </td>
            </tr>

            </c:forEach>
        </table>


<%@ include file="/WEB-INF/views/template/footer.jsp"%>