# Use official Node.js runtime as a parent image
FROM node:18.18.2 as build

# Set the working directory
WORKDIR /app

# Copy package and package-look to the working directory
COPY package*.json ./

# install app dependencies
Run npm install

# Install Angular CLI globally
RUN npm install -g @angular/cli

# Add the source code to app
COPY . . 


# Build the Angular app
RUN ng build

# use a smaller production-ready image for serving the Angular app
From nginx:alpine

# Copy the Angular app build artifacts to the nginx public directory 
COPY --from=build /app/dist/dashboard_admin /usr/share/nginx/html

# start the nginx web server
CMD ["nginx", "-g", "daemon off;"]
# Expose port 80
EXPOSE 80

