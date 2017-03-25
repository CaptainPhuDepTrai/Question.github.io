<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper" style="margin-top:5em">
    <div class="container">
        <div class="page-header">
            <h1>Add Product</h1>
            <p class="lead">Fill the below information to add a product:</p>
        </div>
        <form:form action="${pageContext.request.contextPath}/admin/addProduct" method="post" commandName="product" enctype="multipart/form-data">
        <div class="form-group">
            <label for="productName">Name</label><form:errors path="productName" cssStyle="color: purple"/>
            <form:input path="productName" id="productName" class="form-control"/>
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
            <form:textarea path="productDecription" id="productDecription" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="productPrice">Price</label><form:errors path="productPrice" cssStyle="color: yellow"/>
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
            <label for="unitInStock">Unit In Stock</label><form:errors path="unitInStock" cssStyle="color: red"/>
            <form:input path="unitInStock" id="unitInStock" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="productManufacturer">Manufacturer</label>
            <form:input path="productManufacturer" id="productManufacturer" class="form-control"/>
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