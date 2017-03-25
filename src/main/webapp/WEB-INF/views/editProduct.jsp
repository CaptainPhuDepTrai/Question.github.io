<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper" style="margin-top:5em">
    <div class="container">
        <div class="page-header">
            <h1>Edit Product</h1>
            <p class="lead">Update the below information of the product:</p>
        </div>
        <form:form action="${pageContext.request.contextPath}/admin/editProduct" method="post" commandName="product"
                   enctype="multipart/form-data">
        <form:hidden path="productId" value="${product.productId}" />
        <div class="form-group">
            <label for="productName">Name</label>
            <form:input path="productName" id="productName" class="form-control" value="${product.productName}"/>
        </div>
        <div class="form-group">
            <label for="productCategory">Category:</label>
            <label class="checkbox-inline">
                <form:radiobutton path="productCategory" id="productCategory" value="Instrument"/>
                Instrument
            </label>
            <label class="checkbox-inline">
                <form:radiobutton path="productCategory" id="productCategory" value="Record"/>
                Record
            </label>
            <label class="checkbox-inline">
                <form:radiobutton path="productCategory" id="productCategory" value="Acessory"/>
                Acessory
            </label>
        </div>
        <div class="form-group">
            <label for="productDecription">Decription</label>
            <form:textarea path="productDecription" id="productDecription" class="form-control" value="${product.productDecription}"/>
        </div>
        <div class="form-group">
            <label for="productPrice">Price</label>
            <form:input path="productPrice" id="productPrice" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="productCondition">Condition:</label>
            <label class="checkbox-inline">
                <form:radiobutton path="productCondition" id="productCondition" value="New"/>
                New
            </label>
            <label class="checkbox-inline">
                <form:radiobutton path="productCondition" id="productCondition" value="Used"/>
                Used
            </label>
        </div>
        <div class="form-group">
            <label for="productStatus">Status:</label>
            <label class="checkbox-inline">
                <form:radiobutton path="productStatus" id="productStatus" value="Active"/>
                Active
            </label>
            <label class="checkbox-inline">
                <form:radiobutton path="productStatus" id="productStatus" value="Inactive"/>
                Inactive
            </label>
        </div>
        <div class="form-group">
            <label for="unitInStock">Unit In Stock</label>
            <form:input path="unitInStock" id="unitInStock" class="form-control" value="${product.unitInStock}"/>
        </div>
        <div class="form-group">
            <label for="productManufacturer">Manufacturer</label>
            <form:input path="productManufacturer" id="productManufacturer" class="form-control" value="${product.productManufacturer}"/>
        </div>

        <div class="form-group">
            <label class="control-label" for="productImage">Upload Image</label>
            <form:input path="productImage" id="productImage" type="file" class="form:input-large" />
        </div>

        <br><br>

        <input type="submit" value="Submit" class="btn btn-success"/>

        <a href="<c:url value="/admin/productInventory"/>" class="btn btn-danger">Cancel</a>

        </form:form>

<%@ include file="/WEB-INF/views/template/footer.jsp" %>