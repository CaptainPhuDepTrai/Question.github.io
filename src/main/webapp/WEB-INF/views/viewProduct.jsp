<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Product Details</h1>
            <p class="lead">Here is the detail information of product</p>
        </div>

        <div class="container">
            <div class="row">
                <div class="col-md-5">
                    <img src="<c:url value="/resources/images/${product.productId}.png"/>" alt="image"  style="width: 100%">
                </div>
                <div class="col-md-5">
                    <h3>Product Name: ${product.productName}</h3>
                    <p>Product Decription: ${product.productDecription}</p>
                    <p>Manufacture: ${product.productManufacturer}</p>
                    <p>Category: ${product.productCategory}</p>
                    <p>Condition: ${product.productCondition}</p>
                    <p>Price: ${product.productPrice}</p>
                </div>
            </div>
        </div>
    </div>
</div>

<%@ include file="/WEB-INF/views/template/footer.jsp"%>