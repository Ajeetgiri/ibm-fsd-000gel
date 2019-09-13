const express = require('express');
const server = express();
const parser = require('body-parser');
const cors = require('cors');
const authenticate = require('./services/security').authenticate;
const userRoutes = require('./apis/users').userRoutes;
const projectRoutes = require('./apis/projects').projectRoutes;
const setContentHeader = require('./services/utils').setContentHeader;
server.use(parser.json());

server.use(cors());

