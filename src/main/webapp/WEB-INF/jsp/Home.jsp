<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cake Shop Home</title>
	<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    <!-- Linking External CSS -->
	<link rel="stylesheet" href="./css/Home.css">
</head>
<body>

    <div class="cake-box" id="cakeBox">
        <h2 id="heading">Cake Shop</h2>

        <form id="cakeForm">
			<input type="hidden" id="cakeId">
            <label>Enter Cake Name:</label>
            <input type="text" id="cakeName" placeholder="Enter Cake Name" required>

            <label>Select Cake Type:</label>
            <select id="cakeType" required>
                <option value="">-- Select Cake Type --</option>
                <option value="Chocolate Cake">Chocolate Cake</option>
                <option value="Vanilla Cake">Vanilla Cake</option>
                <option value="Black Forest Cake">Black Forest Cake</option>
                <option value="Red Velvet Cake">Red Velvet Cake</option>
                <option value="Strawberry Cake">Strawberry Cake</option>
                <option value="Butterscotch Cake">Butterscotch Cake</option>
                <option value="Pineapple Cake">Pineapple Cake</option>
            </select>

            <label>Enter Price:</label>
            <input type="number" id="cakePrice" placeholder="Enter Price" required>

			<button type="button" id="submitBtn" onclick="saveOrUpdateCake()">Submit</button>
        </form>
		<!-- jQuery must be first -->
		    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

		    <!-- Only one script line needed -->
		    <script src="${pageContext.request.contextPath}/js/Home.js"></script>
		
    </div>
	
	</div>   <!-- cake-box close -->

	<!-- Table must be here -->
	<div class="table-container">
	    <h2>Cake List</h2>

	    <table id="cakeTable">
	        <thead>
	            <tr>
	                <th>id</th>
	                <th>Cake Name</th>
	                <th>Cake Type</th>
	                <th>Price</th>
	                <th>Action</th>
	            </tr>
	        </thead>

	        <tbody id="cakeTableBody">
	        </tbody>
	    </table>
	</div>

</body>
</html>